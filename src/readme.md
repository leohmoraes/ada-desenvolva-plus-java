## Questão 1 ( 3 pontos ) - Combustivel

Um motorista precisa abastecer seu carro para uma viagem. O carro tem um consumo médio de combustível de 12 km por litro e o motorista planeja percorrer uma distância de 360 km. Crie um programa que solicite o preço do combustível por litro ao usuário e calcule o custo total da viagem. Além disso, informe quantos litros de combustível serão necessários para completar a viagem.

- consumo: 12km/l
- distancia: 360km
- qual o valor do litro de combustivel?
- informa o custo total da viagem
- informa quantos litros gastos na viagem


### Tarefas
- Scanner para informar os dados
- constantes: consumo e distancia
- calculo da consumo
- calculo da viagem utilizando o valor do litro


### Saída Esperada
```
Informe o valor do litro do Combustível (ex: 6.01):
6.1

O consumo total da viagem é de 30,00 litros.
O gasto total da viagem é de 183,00.
```

## Questão 2 ( 3 pontos ) - Alunos aprovados

Dada uma turma de alunos com N alunos, sendo que essa quantidade deve ser solicitada e definida pelo usuário, solicite o nome e a nota de cada um dos alunos. Seu programa deve imprimir apenas aqueles alunos que tiraram nota maior que a média da nota de todos os alunos.

### Tarefas
- solicitar quantidade de alunos
- solicitar nome e nota para cada aluno
- fazer a media da nota dos alunos
- mostrar apenas alunos que tiveram nota acima da media

### Saída Esperada
```
Informe a quantidade de alunos da turma:
3
Informe o nome do Aluno 1: Diana
Informe a nota do Aluno 1: 2
Informe o nome do Aluno 2: Agatha
Informe a nota do Aluno 2: 5
Informe o nome do Aluno 3: Luigi
Informe a nota do Aluno 3: 10

A nota média da turma é 5,67.
Alunos aprovados:
- Luigi
```

## Questão 3 ( 3 pontos ) - Pizza

Uma família está dividindo uma pizza entre seus membros. Crie um programa que solicite o número de membros da família e o número de fatias da pizza. O programa deve calcular quantas fatias cada membro vai receber, e informar se haverá sobras e quantas fatias sobrarão. Se a pizza não puder ser igualmente dividida, o programa deve sugerir quantas fatias adicionais são necessárias para que todos recebam a mesma quantidade.

### Tarefas
- Solicitar o numero de pessoas
- Solicitar o numero de fatias da pizza
- Calcular quantidade de fatias por pessoa
- Se sobrar, informar a quantidade de fatias que sobram
- Se tiver pessoas com menos fatias, informar quantas fatias faltam para ficarem com a mesma quantidade

### Saída Esperada
```
Quantas pessoas irão saborear a pizza? 4
Quantas fatias tem a pizza? 12
Quantidade de fatias que sobram: 0
Não faltam fatias, exceto se todos querem mais!

Quantas pessoas irão saborear a pizza? 4
Quantas fatias tem a pizza? 14
Quantidade de fatias que sobram: 2
Quantidade de fatias que faltam para não ter brigas: 2

Quantas pessoas irão saborear a pizza? 4
Quantas fatias tem a pizza? 15
Quantidade de fatias que sobram: 3
Quantidade de fatias que faltam para não ter brigas: 1
```

## Questão 4 ( 1 ponto ) Numero Primo

Um número para ser considerado primo deve ser divisível apenas por 1 e ele mesmo. Considerando isso, crie um programa que vai solicitar um número para o usuário e dizer se ele é primo.

### Tarefas
- Solicitar a digitacao de um numero inteiro
- Calcular se ele é SOMENTE divisivel por ele mesmo E divisivel por 1
- Retorna a mensagem se é Primo ou não.

### Saída Esperada

```
Informe o número para confirmar se ele é um número primo:
X, é um número primo!
Y, não é um número primo!

Informe o número para confirmar se ele é um número primo: 9
9, não é um número primo!

Informe o número para confirmar se ele é um número primo: 11
11, é um número primo!
```