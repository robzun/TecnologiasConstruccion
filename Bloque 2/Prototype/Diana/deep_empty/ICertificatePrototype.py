import copy
from PyPDF2 import PdfReader, PdfWriter
from reportlab.pdfgen import canvas
from reportlab.lib.pagesizes import letter
import os

class ICertificatePrototype:
    def clone(self):
        return copy.deepcopy()
