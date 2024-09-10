from PIL import Image

from App.Interfaces import ImageFetcher
import os
import random

class FetchRandomImage(ImageFetcher):
    @staticmethod
    def get_random_images(number_of_images, path):
        images_path = os.listdir(path)
        images = []

        for i in range(number_of_images):
            image_name = random.choice(images_path)
            full_image_path = os.path.join(path,image_name)
            image = Image.open(full_image_path)
            images.append(image)

        return images