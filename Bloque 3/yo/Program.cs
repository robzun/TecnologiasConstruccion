Grupo grupo1 = new Grupo("LIS-501");
Alumno alumno1 = new Alumno("roberto","s22017031");
Alumno alumno2 = new Alumno("jorge","s22017016");
Materia materia1 = new Materia("bases de datos");
Materia materia2 = new Materia("tecnologías");
grupo1.agregarAlumno(alumno1);
grupo1.agregarAlumno(alumno2);
alumno1.agregarMateria(materia1, 10);
alumno1.agregarMateria(materia2, 8);
alumno2.agregarMateria(materia1, 10);
alumno2.agregarMateria(materia2, 8);

double promedio = grupo1.getPromedio();

Console.WriteLine("El promedio de " + grupo1.getNombre + " es " + promedio);