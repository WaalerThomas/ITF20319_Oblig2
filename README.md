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