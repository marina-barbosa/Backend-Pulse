conta_normal = True
conta_universitaria = False

saldo = 2000
saque = 2500
cheque_especial = 450


if conta_normal:
    if saldo >+ saque:
        print("Saque realizado com sucesso!")
    elif saque <= (saldo + cheque_especial):
        print("Saque realizado com uso do cheque especial!")
elif conta_universitaria:
    if saldo >= saque:
        print("Saque realizado com sucesso!")
    else:
        print("Saldo insuficient!e")

#####

status = "Sucesso" if saldo >= saque else "Falha"
print(f"{status} ao realizar o saque!")
