# shell interativo do ruby $irb

# Exemplo de variáveis e input/output
puts "Digite seu nome:"
nome = gets.chomp # chomp é um método que remove os caracteres de quebra de linha
puts "Olá, #{nome}!"

# Exemplo de operadores
numero1 = 10
numero2 = 5
soma = numero1 + numero2
subtracao = numero1 - numero2
multiplicacao = numero1 * numero2
divisao = numero1 / numero2
puts "Soma: #{soma}, Subtração: #{subtracao}, Multiplicação: #{multiplicacao}, Divisão: #{divisao}"

# Exemplo de escopo e método
def saudacao
  mensagem = "Olá, mundo!"
  puts mensagem
end

saudacao

# Exemplo de função com !
def modificar_string!(str)
  str.upcase!
end

texto = "ruby é legal"
modificar_string!(texto)
puts texto  # Vai imprimir "RUBY É LEGAL"

# Exemplo de função com ?
def eh_maiusculo?(str)
  str == str.upcase
end

puts eh_maiusculo?("OLÁ")  # Vai imprimir true
puts eh_maiusculo?("Olá")  # Vai imprimir false