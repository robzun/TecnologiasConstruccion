import pandas as pd

class ExternalUserAPI:
    def get_user_data(self):
        data = {
            'id':[1,2,3],
            'name':['nava','rafa', 'moya'],
            'email':['nava@uv.com','rafadocs@gmail.com','moya@uv.com']
        }
        return pd.DataFrame(data)