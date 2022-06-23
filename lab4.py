print("C11 = ", 1517 % 11, "//Визначити клас студент, який складається як мінімум з 5-и полів")


def print_students(array):
    print('-' * 77)
    print("| %-15s | %-13s | %-8s | %-13s | %-10s |" % ("Прізвище", "Ім'я", "Група", "№ спеціальності", "Факультет"))
    print('-' * 18 + '+' + '-' * 15 + '+' + '-' * 10 + '+' + '-' * 17 + '+' + '-' * 13)
    for i in array:
        print(i)
    print('-' * 77)


class Student:
    def __init__(self, surname, name, group, speciality, department):
        self.__surname = surname
        self.__name = name
        self.__group = group
        self.__speciality = speciality
        self.__department = department

    def __str__(self):
        return "| %-15s | %-13s | %-8s | %-15d | %-10s |" % (self.__surname, self.__name, self.__group, self.__speciality, self.__department)

    def getName(self):
        return self.__name

    def getGroup(self):
        return self.__group

stud1 = Student("Сапон", "Денис", "ІО-15", 123, "ФІОТ")
stud2 = Student("Вольський", "Роман", "ІО-15", 123, "ФІОТ")
stud3 = Student("Пайтоненко", "Пайтон", "ПІ-03", 310, "ФПІО")
stud4 = Student("Червоний", "Ян", "ІП-11", 121, "ФІОТ")
stud5 = Student("Алещенко", "Олексій", "AA-00", 123, "ФІОТ")
stud_array = [stud1, stud2, stud3, stud4, stud5]


print("Список студентів:")
print_students(stud_array)

sorted_students = sorted(stud_array, key=lambda x: x.getName())
print("\nСписок студентів відсортованих за ім'ям:")
print_students(sorted_students)

sorted_students = sorted(stud_array, key=lambda x: x.getGroup(), reverse=True)
print("\nСписок студентів обернено відсортованих за групою:")
print_students(sorted_students)
