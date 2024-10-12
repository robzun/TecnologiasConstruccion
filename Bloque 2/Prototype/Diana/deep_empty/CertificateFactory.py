class CertificateFactory:
    def __init__(self):
        self.certificate_prototypes = {}

    def add_prototype(self, key, certificate):
        self.certificate_prototypes[key] = certificate

    def create_certificate(self, key):
        return self.certificate_prototypes[key].clone()
