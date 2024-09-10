# TargetSistemas

### Prova Técnica da Target Sistemas

### Questão 1

Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2
valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem
que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode
ser previamente definido no código;

### Questão 2

Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou
minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode
ser previamente definida no código;

### Questão 3

Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K =
K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

R: 77

### Questão 4

Descubra a lógica e complete o próximo elemento:</p>
a) 1, 3, 5, 7, <u>9</u> (Números ímpares consecutivos) </p>
b) 2, 4, 8, 16, 32, 64, <u>128</u> (Dobro do valor anterior) </p>
c) 0, 1, 4, 9, 16, 25, 36, <u>49</u> (Quadrados perfeitos) </p>
d) 4, 16, 36, 64, <u>100</u> (Quadrado dos valores pares) </p>
e) 1, 1, 2, 3, 5, 8, <u>13</u> (Sequência de Fibonacci) </p>
f) 2, 10, 12, 16, 17, 18, 19, <u>20</u></p>

### Questão 5

Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes.
Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores
quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você
faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor
controla cada lâmpada?

Primeiramente, começo rotulando os interruptores de 1 a 3. Em seguida, ligo o interruptor 1 e
espero um tempo. Depois, desligo o interruptor 1 e ligo o interruptor 2. Ao entrar em uma sala
qualquer tenho três situações possíveis:

* A lâmpada está acesa: o interruptor 2 controla a lâmpada.
* A lâmpada está apagada e fria: o interruptor 3 controla a lâmpada.
* A lâmpada está apagada e quente: o interruptor 1 controla a lâmpada.

A partir das situações acima consigo identificar qual interruptor controla a lâmpada da sala no qual
eu entrei. Na próxima sala, só haverão duas situações possíveis, e por fim não será necessário
entrar na terceira sala, pois já saberei qual interruptor controla a lâmpada da terceira sala.
