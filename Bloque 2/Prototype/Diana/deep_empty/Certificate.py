from ICertificatePrototype import ICertificatePrototype
from PyPDF2 import PdfReader, PdfWriter
from reportlab.pdfgen import canvas
from reportlab.lib.pagesizes import letter
from reportlab.lib.utils import ImageReader
import io
import copy

class Certificate(ICertificatePrototype):
    def __init__(self, template_path, student_photo_path = None):
        self.template_path = template_path
        self.student.name = ""
        self.student_photo_path = student_photo_path

    def set_student(self, student_name):
        self.student_name = student_name

    def set_student_photo(self, student_photo_path):
        self.student_photo_path = student_photo_path

    def generate_certificate(self, output_path):
        reader = PdfReader(self.template_path)
        writer = PdfWriter()

        packet = io.BytesIO()
        c = canvas.Canvas(packet, pagesize = letter)
        width, height = letter

        c.setFont("Times-Roman", 50)
        c.drawCentredString(width / 2.0, height - 490, f"{self.student_name}")

        if self.student_photo_path:
            student_photo = ImageReader(self, student_photo_path)
            c.drawImage(student_photo, 60, height - 350, width=100)

        c.save()

        packet.seek(0)

        new_pdf = PdfReader(packet)
        new_page = new_pdf.pages[0]

        page.merge_page(new_page)

        writer.add_page(page)

        with open(output_path, "wb") as output_file:
            writer.write(output_file)

        print(f"Certificado generado: {output_path}")

    def clone(self):
        return copy.deepcopy(self)