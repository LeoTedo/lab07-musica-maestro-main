# Musica maestro!

## Specifica dei requisiti

Obiettivo dell'esercizio è *progettare* e *realizzare* un insieme di classi che consentano di simulare un insieme di *
strumenti musicali*, seguendo passo passo le specifiche di seguito riportate.

Prima di passare a uno step successivo consigliamo di assicurarsi con semplici test (usando JUnit) che quanto scritto
funzioni.

#### Step 1

Implementare due diverse classi che rappresentano due diversi strumenti musicali: `Trumpet` e `Horn`. Entrambe le classi
implementano l'interfaccia `MusicalInstrument` e rispondono alla chiamata del metodo

```java
public @NotNull String play()
```

che restituisce nel primo caso la stringa `"pepepe"` e nel secondo la stringa `"papapa"`.

#### Step 2

Implementare altre due classi `WaterGlass` e `IronRod`. Esse, pur NON implementando l'interfaccia `MusicalInstrument`
hanno un comportamento molto simile: `WaterGlass` possiede un metodo

```java
public @NotNull String tap()
```

che restituisce la stringa `"diding"`;

`IronRod` invece aderisce alla interfaccia `GermanPercussiveInstrument` e risponde quindi alla chiamata

```java
public @NotNull String spiel()
```

restituendo la stringa `"tatang"`.

#### Step 3

Aggiungere la possibilità di **usare** istanze della classe `WaterGlass` e delle classi aderenti alla
interfaccia `GermanPercussiveInstrument` (e in particolare perciò della classe `IronRod`) come oggetti di
tipo `MusicalInstrument`. Tale obiettivo deve essere raggiunto usando il *design pattern* denominato
**adapter**; più in dettaglio, è richiesta la realizzazione di due diversi adapter: `WaterGlassInstrument` che realizza
un *Class adapter* e `GermanMusicalInstrument` che realizza invece un *Object adapter*.

#### Step 4

Creare una classe che rappresenti un'orchestra di oggetti di tipo `MusicalInstrument`. Tale obiettivo deve essere
raggiunto usando il *design pattern* denominato **composite**; più in dettaglio, è richiesta la realizzazione di una
classe `Orchestra` che deve implementare l'interfaccia `MusicalInstrument` e deve rispondere all'invocazione del
metodo `String play()` demandando la chiamata agli oggetti `MusicalInstrument` *aggregati* e inserendo degli a capi tra
l'uno e l'altro. Gli oggetti che compongono il gruppo orchestrale vengono passati all'interno di una `Collection`
direttamente al costruttore della classe `Orchestra`:

```java
public Orchestra(@NotNull Collection<MusicalInstrument> instruments) 
```

#### Step 5

E' necessario avere di ogni strumento una versione che suoni **fortissimo** (cioè il cui suono sia tutto in lettere
maiuscole). Per evitare un proliferare di nuove classi, tale obiettivo deve essere raggiunto usando il *design pattern*
denominato
**decorator**. Più in dettaglio, è richiesta la realizzazione di una classe `Fortissimo` che implementa
l'interfaccia `MusicalInstrument` e *decora* un'istanza di `MusicalInstrument` in modo che il suono prodotto
dall'elemento decorato risulti tutto in maiuscolo.

#### Step 6

E' necessario avere di ogni strumento una versione che suoni **lentamente** (cioè le cui vocali vengano triplicate),
anche in questo caso tramite pattern `Decorator`.

Visto che ci sono chiaramente delle parti di codice in comune (specifiche del pattern decorator) con la classe
sviluppata al punto 5, prima di procedere alla scrittura di questa classe, modificare la classe Fortissimo facendola
ereditare da una nuova classe `AbstractDecorator` che appunto fattorizzi il codice comune.

E' richiesta quindi la realizzazione di una classe `Slow` che estenda la classe `AbstractDecorator` e *decora*
un'istanza di `MusicalInstrument` in modo che il suono prodotto dall'elemento decorato risulti con le vocali triplicate.

Nella classe astratta si consiglia di cercare un *template* di decorazione parametrico rispetto a un metodo astratto 

```java
public @NotNull String transformEffect(@NotNull String sound)
```
che sarà l'unica cosa che dovranno realizzare i decoratori concreti.

#### Step 7

Verificare che funzionino le varie combinazioni di strumenti, decoratori, e gruppi orchestrali.
