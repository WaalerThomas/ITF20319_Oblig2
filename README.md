# ITF20319_Oblig2
## Requirements
- Java JDK 17.0.8
- Maven 17

# Oblig 3 - Steg forklaring
Startet med å opprette en github action fil, "run-tests.yaml", under ".github/workflows".
Deretter satt jeg action til å kjøre hver gang det er gjort en push eller en pull-request på main branchen,
for så å opprette en tests job kalt "Run tests" som skal kjøre på ubuntu-latest.

Neste jeg trenger å gjøre er å sette opp stegene med hvilke actions jeg trenger.
Disse er:
- checkout, fra github
  - For å hente ned koden til test maskinen
- setup-java, fra github

Det er bare de to actions jeg trenger. Det neste er å bygge prosjektet med maven, "Build with Maven" steget.
Deretter kjører jeg testene, "Run tests" steget.

Etter at jeg committet og pushet disse endringene til github, så kjørte action min.
Når jeg ser på loggen under "Run tests" så kan jeg se at den ikke kjørte testene.
Prøvde da å gjøre sånn at noen av testene feiler for å se om det er bare at alle testene fungerer, men det var ikke problemet.
Det neste jeg prøvde var å sette "testSourceDirectory" innstillingen i pom filen min, men dette fikset det heller ikke.
Deretter splittet jeg opp maven kompilering og testing, dette gjorde det enklere å se resultatet av testene som enda ikke ble kjørt.

Det neste jeg tenkte var "Hvilken versjon av Maven kjøres på github?", og da innså jeg at jeg aldri kjørte en set up av Maven ️🤦🏻‍♂️.
Så da la jeg til action "setup-maven" fra stCarolas, hvor jeg setter maven versjonen til 3.9.1, som er det samme jeg kjører på min maskin.

Siden jeg har allerede endret koden min sånn at noen tester feiler, så får jeg en rød X i github som sier at tester har feilet.