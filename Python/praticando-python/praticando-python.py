numPedidos = int(input())

for i in range(1, numPedidos + 1):
    prato = input()
    calorias = int(input())
    ehVegano = input().lower() == 's'  # Convertendo a entrada para um valor booleano (True se for 's', False se for 'n')

    # Formatando a saída com base no valor de "ehVegano"
    if ehVegano:
        tipoVegano = "Vegano"
    else:
        tipoVegano = "Nao-vegano"

    print(f"Pedido {i}: {prato} ({tipoVegano}) - {calorias} calorias")