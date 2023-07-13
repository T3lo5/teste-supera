# Desafios

Este repositório contém soluções em Java para quatro desafios diferentes.

## Como rodar o projeto

Para rodar os desafios em Java, siga as instruções abaixo:

1. Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.
2. Clone este repositório ou faça o download dos arquivos.
3. Navegue até o diretório do desafio que deseja executar.
4. Compile os arquivos Java com o comando `javac nome_do_arquivo.java` (substitua "nome_do_arquivo" pelo nome do arquivo do desafio que deseja compilar).
5. Execute o programa com o comando `java nome_do_arquivo` (substitua "nome_do_arquivo" pelo nome do arquivo compilado, sem a extensão `.java`).
6. Siga as instruções do programa para inserir os valores necessários e obter os resultados.

## Primeiro Desafio: Ordenação de Valores

Dado um conjunto de valores inteiros não negativos, a solução ordena esses valores da seguinte forma:
- Primeiro os pares em ordem crescente.
- Depois os ímpares em ordem decrescente.

### Entrada
- A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105), representando o número de linhas de entrada que virão a seguir.
- As próximas N linhas contêm valores inteiros não negativos.

### Saída
- Apresenta todos os valores lidos na entrada de acordo com a ordem descrita acima.
- Cada número é impresso em uma linha separada.

## Segundo Desafio: Decomposição de Valor Monetário

Dado um valor de ponto flutuante com duas casas decimais, representando um valor monetário, a solução calcula o menor número de notas e moedas necessárias para representar esse valor.

As notas consideradas são: 100, 50, 20, 10, 5, 2. As moedas consideradas são: 1, 0.50, 0.25, 0.10, 0.05 e 0.01.

### Entrada
- O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

### Saída
- Imprime a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, seguindo o exemplo fornecido no enunciado.
- Utilize ponto (.) para separar a parte decimal.

## Terceiro Desafio: Contagem de Pares com Diferença Específica

Dado um array de inteiros e um valor alvo, a solução determina o número de pares entre os elementos do array em que a diferença é igual ao valor alvo.

### Entrada
- O código deve conter duas entradas: n e k, representando o tamanho do array e o valor alvo.
- O código deve conter um array de inteiros, de tamanho n.

### Saída
- Retorna o número de pares que satisfazem o critério.

## Quarto Desafio: Desembaralhar Linhas de Texto

Dada uma linha de texto, que foi impressa de forma incorreta pela impressora infectada por um vírus, a solução desembaralha a string para sua forma original.
A linha de texto está sendo impressa de dentro para fora, onde a metade esquerda de cada linha é impressa a partir do meio até a margem esquerda, e a metade direita de cada linha é impressa a partir da margem direita em direção ao centro.

### Entrada
- A entrada contém vários casos de teste.
- A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste.
- Seguem N linhas, cada uma com uma frase com no mínimo 2 e no máximo 100 caracteres de letras maiúsculas e espaços, que deverão ser desembaralhadas para a sua forma original.

### Saída
- Para cada linha de entrada, imprime uma linha de saída com a frase decifrada.

---

*Este repositório foi criado como parte da resolução de desafios propostos.*
