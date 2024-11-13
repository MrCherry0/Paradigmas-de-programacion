class Empleado:
    def __init__(self, nombre, id, salario_base):
        self._nombre = nombre  # Atributos encapsulados
        self._id = id
        self._salario_base = salario_base

    # Métodos getters y setters
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def id(self):
        return self._id

    @id.setter
    def id(self, id):
        self._id = id

    @property
    def salario_base(self):
        return self._salario_base

    @salario_base.setter
    def salario_base(self, salario_base):
        self._salario_base = salario_base

    # Método para calcular el salario
    def calcular_salario(self):
        return self._salario_base


class EmpleadoTiempoCompleto(Empleado):
    def calcular_salario(self):
        # Agrega un bono del 10% al salario base
        return self._salario_base * 1.1


class EmpleadoMedioTiempo(Empleado):
    def calcular_salario(self):
        # Devuelve el 50% del salario base
        return self._salario_base * 0.5


class EmpleadoPorHoras(Empleado):
    TARIFA_POR_HORA = 20.0  # Tarifa fija por hora

    def __init__(self, nombre, id, salario_base=0.0):
        super().__init__(nombre, id, salario_base)
        self._horas_trabajadas = 0

    # Método para establecer horas trabajadas
    def set_horas_trabajadas(self, horas):
        self._horas_trabajadas = horas

    def calcular_salario(self):
        # Calcula el salario en base a horas trabajadas y tarifa por hora
        return self._horas_trabajadas * self.TARIFA_POR_HORA


def main():
    # Lista de empleados
    empleados = []

    # Crear empleados de diferentes tipos
    tiempo_completo = EmpleadoTiempoCompleto("Carlos", "TC123", 2000.0)
    medio_tiempo = EmpleadoMedioTiempo("Ana", "MT456", 1500.0)
    por_horas = EmpleadoPorHoras("Luis", "PH789")
    por_horas.set_horas_trabajadas(80)  # Suponiendo que trabajó 80 horas

    # Agregar empleados a la lista
    empleados.append(tiempo_completo)
    empleados.append(medio_tiempo)
    empleados.append(por_horas)

    # Mostrar salario calculado para cada empleado
    for empleado in empleados:
        print(f"Empleado: {empleado.nombre} (ID: {empleado.id})")
        print(f"Salario calculado: ${empleado.calcular_salario():.2f}")
        print()

if __name__ == "__main__":
    main()
