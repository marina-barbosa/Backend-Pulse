# Em Python, enumerate() é uma função muito útil que permite iterar sobre uma sequência (como lista, tupla, string, etc.) enquanto também acompanha o índice atual de cada elemento na sequência. A função enumerate() retorna um objeto iterável que gera pares de índice-elemento.


enumerate(iteravel, start=0)
# iteravel: A sequência que você deseja iterar.

# start (opcional): Valor do índice inicial que você quer atribuir ao primeiro elemento. O padrão é 0.



fruits = ['apple', 'banana', 'orange']

for index, fruit in enumerate(fruits):
    print(index, fruit)
# 0 apple, 1 banana, 2 orange



# Como você pode ver, a função enumerate() fornece o índice e o valor do elemento atual a cada iteração do loop. Isso pode ser útil em várias situações, como:

# Acessar o índice e o valor ao mesmo tempo, evitando a necessidade de rastrear um contador separado.

# Atualizar ou modificar elementos da sequência com base em seus índices.

# Criar dicionários ou mapeamentos com índices como chaves e valores da sequência como valores associados.

# Em resumo, a função enumerate() é uma ferramenta útil para percorrer sequências e rastrear os índices dos elementos simultaneamente, tornando o código mais limpo e eficiente em muitos casos.