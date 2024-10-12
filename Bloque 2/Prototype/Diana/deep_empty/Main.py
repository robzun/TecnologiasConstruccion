from Certificate import Certificate
from CertificateFactory import CertificateFactory
import os

def read_student_names(nombres):
    with open(nombres, 'r') as file:
        names = [line.strip() for line in file.readlines]

    return names

def read_student_photos(fotos):
    with open(fotos, 'r') as file:
        paths = [line.strip() for line in file.readlines]

    return paths

def save_certificate_to_file(plantilla, filename = "plantilla.pdf"):
    directory = os.path.join(os.path.dirname(os.path(__file__)), "certificados_hechos")

    if not os.path.exists(directory):
        os.makedirs(directory)

    output_path = os.path.join(directory, filename)

    plantilla.generate_certificate(output_path)

    print(f"certificado pdf generado: {output_path}")


if __name__ == "__main__":
    
    certificatre_factory = CertificateFactory()

    base_certificate = Certificate("plantilla.pdf")
    certificatre_factory.add_prototype("base_certificate", base_certificate)


    student_names = read_student_names
    student_photos = read_student_photos

    for student, photo in zip(student_names, student_photos):
        print(f"Generando certificado para: {student}")
        student_certificate = certificatre_factory.create_certificate("base_certificate")
        student_certificate.set_student(student)
        student_certificate.set_student_photo(student_photo(photo))

        filename = f"Certificate{student}.pdf"
        save_certificate_to_file(student_certificate, filename)

        print(f"Certificado para {student} guardado como {filename}")
    