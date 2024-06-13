Introdução

Este relatório apresenta um resumo do status do projeto em sua etapa 4, focada na seleção de instruções MIPS para o compilador. A seção "Metodologia" descreve o processo de adaptação das instruções Joette para MIPS, enquanto a seção "Resultados" apresenta uma tabela com as instruções selecionadas e uma explicação detalhada das escolhas.

Metodologia

Inicialmente, o compilador foi desenvolvido utilizando as instruções da máquina Joette. Em seguida, o código gerado foi adaptado para as instruções equivalentes em MIPS. Essa mudança exigiu um esforço significativo para lidar com diferenças entre as arquiteturas, como a instrução Store Word. Para superar esses desafios, a equipe se reuniu e trabalhou em conjunto para encontrar soluções adequadas.

Resultados

A tabela a seguir lista as instruções MIPS selecionadas para o compilador, junto com suas equivalentes em Joette:
Instrução MIPS	Instrução Joette	Motivação da Escolha
add	add	Equivalência funcional direta
sub	sub	Equivalência funcional direta
mul	mul	Equivalência funcional direta
div	div	Equivalência funcional direta
lw	lw	Funcionalidade semelhante à instrução "load" da Joette
sw	sw	Funcionalidade semelhante à instrução "store" da Joette
beq	beq	Equivalência funcional direta
bne	bne	Equivalência funcional direta
j	jmp	Equivalência funcional direta

A escolha das instruções MIPS foi guiada pela busca por equivalentes funcionais às instruções Joette existentes. Essa estratégia visa aproveitar as instruções já descritas no livro-texto e minimizar a necessidade de adaptações complexas.

Conclusão

A equipe concluiu com sucesso a adaptação do compilador para as instruções MIPS. A seleção das instruções foi realizada de forma que as instruções  equivalentes funcionais às instruções Joette existentes. O código foi testado para as entradas de teste disponíveis no site do mini java.

Próximos Passos

As próximas etapas do projeto envolvem a implementação das instruções selecionadas no compilador e a realização de testes para garantir o correto funcionamento do código gerado.