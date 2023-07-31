print("\nMETODOS UTEIS\n")
curso = "pYtHon"

print(curso)

print(curso.upper())
print(curso.lower())
print(curso.title())

curso = "   Python "
print(curso + ".")
print(curso.strip() + ".")
curso = "   Python "
print(curso.lstrip() + ".")
print(curso.rstrip() + ".")
curso = "python"
print(curso.center(10, "0"))
print(curso.center(10, "*"))
print(".".join(curso))

print("\nFATIAMENTO\n")
nome = "Guilherme Arthur de Carvalho"
print(nome[0])
print(nome[:9])
print(nome[10:])
print(nome[10:16])
print(nome[10:16:2])
print(nome[:])
print(nome[::-1])

print("\nMULTIPLAS LINHAS")
nome = "Guilherme"
mensagem = f"""
Olá meu nome é {nome},
Eu estou aprendendo {curso}.
"""
print(mensagem)
mensagem = f'''
    Olá meu nome é {nome},
    Eu estou aprendendo {curso}.
            Essa mensagem tem diferentes recuos.
'''
print(mensagem)

print("\nINTERPOLACAO DE VARIAVEIS\n")
nome = "Guilherme"
idade = 28
curso = "Python"

print(f"Olá, me chamo {nome}. Tenho {idade} anos e estou matriculado no curso de {curso}.")

print("Olá, me chamo {}. Tenho {} anos e estou matriculado no curso de {}.".format(nome, idade, curso))

print("Olá, me chamo {1}. Tenho {2} anos e estou matriculado no curso de {0}.".format(curso, nome, idade))

print("Olá, me chamo {name}. Tenho {age} anos.".format(name=nome, age=idade))

pessoa = {"nome": "Guilherme", "idade": 28}
print("Olá, me chamo {nome}. Tenho {idade} anos.".format(**pessoa))


PI = 3.14159

print(f"Valor de PI: {PI:.2f}")
print(f"Valor de PI: {PI:10.2f}")



