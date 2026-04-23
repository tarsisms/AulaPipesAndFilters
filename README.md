# Aula Pipes and Filters

Projeto didático em Java para demonstrar o padrão arquitetural **Pipes and Filters**.

## Objetivo

O projeto mostra como montar um pipeline de processamento onde cada etapa (filtro) transforma a entrada e passa o resultado para a próxima etapa.

No exemplo atual:

- Entrada: `10`
- `StepTwo`: soma `20`
- Saída: `30`

Se `StepOne` for habilitado no `Main`, o fluxo passa por duas etapas:

- Entrada: `10`
- `StepOne`: soma `10` -> `20`
- `StepTwo`: soma `20` -> `40`

## Estrutura do projeto

```text
src/main/java/br/edu/ifal/
|- Main.java       # ponto de entrada da aplicação
|- Pipeline.java   # classe que encadeia e executa filtros
|- Filter.java     # contrato de um filtro (interface)
|- StepOne.java    # filtro que soma 10
|- StepTwo.java    # filtro que soma 20
```

## Como funciona

1. `Main` cria um `Pipeline<Integer>`.
2. Filtros são adicionados com `addFilter(...)`.
3. `execute(input)` percorre os filtros em ordem.
4. Cada filtro recebe a saída do anterior.

## Pré-requisitos

- JDK instalado (recomendado Java 17+)
- Gradle Wrapper (já incluso no projeto)

## Executar o projeto

### Opção 1: via IDE

Execute a classe `br.edu.ifal.Main`.

### Opção 2: via terminal

Como o projeto usa apenas o plugin `java`, você pode compilar e executar manualmente:

```bash
./gradlew clean build
java -cp build/classes/java/main br.edu.ifal.Main
```

No Windows:

```bat
gradlew.bat clean build
java -cp build\classes\java\main br.edu.ifal.Main
```

## Como adicionar um novo filtro

1. Crie uma classe que implemente `Filter<Integer>` (ou outro tipo genérico usado no pipeline).
2. Implemente o método `execute`.
3. Adicione no `Main` com `pipeline.addFilter(new SeuFiltro())`.

Exemplo:

```java
public class StepThree implements Filter<Integer> {
    @Override
    public Integer execute(Integer input) {
        return input * 2;
    }
}
```

## Conceitos praticados

- Padrão Pipes and Filters
- Programação orientada a interfaces
- Uso de generics em Java
- Encadeamento de processamento
