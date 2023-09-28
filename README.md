# Singleton Design Pattern - Tietokantayhteydenhallinta

Tämä Java-esimerkki esittää Singleton-suunnittelumallin käytön tietokantayhteydenhallinnassa. Singleton-malli varmistaa, että ohjelma käyttää vain yhtä tietokantayhteyttä ja että se on globaalisti saatavilla. Tämä vähentää tarpeetonta resurssien käyttöä ja auttaa ylläpitämään yhteyden eheyttä.

## Toteutus

Tietokantayhteydenhallintaan käytetään `DatabaseConnection` -luokkaa, joka toimii Singletonina. Tämä luokka luo yhteyden tietokantaan yksityisessä konstruktorissaan ja tarjoaa julkisen `getInstance()` -metodin yhteyden hakemiseen. Singleton-varmennus varmistaa, että vain yksi `DatabaseConnection` -instanssi on olemassa kerrallaan.