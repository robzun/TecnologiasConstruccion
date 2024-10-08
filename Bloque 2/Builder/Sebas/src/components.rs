#[derive(Clone)]

pub struct User{
    name : String,
    password: String,
    sudoer: bool
}

impl User{
    pub fn from(name: &str, password: &str, sudoer: bool) -> Self{
        return Self{
            name: String::from(name),
            password: String::from(password),
            sudoer: sudoer
        };
    }
    pub fn get_name(&self) -> String{
        return self.name.clone();
    }
    pub fn get_password(&self) -> String{
        return self.password.clone();
    }
    pub fn get_sudoer(&self) -> bool{
        return self.sudoer;
    }
}

impl std::fmt::Debug for User {
        fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
            writeln!(f,"User {{\n name: {}\n Password: {}\n Sudo: {}\n}}", self.get_name(),self.get_password(),self.get_sudoer())?;
            Ok(())
        }
    }