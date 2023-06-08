# Projektrapport: Gruppnamn
* Johan Romeo solo

## Gruppen
* Solo Johan Romeo

### Ert namn
* Johan Romeo

### Medlemmar i gruppen
* Johan Romeo

### Beskrivning av projektet
* Av Marcus fick vi i uppgift att simulera anrop via en facade till ett API genom användning av Mockito för att kunna hämta väderdata och utföra tester med Mockito och JUnit5 för att säkerställa trygga och robusta metodanrop.

### Vem har gjort vad
* Jag, Johan Romeo, gjorde allt.

### Vad ni har gjort
* Jag, Johan Romeo, gjorde allt.

## Arbetet och dess genomförande
* Jag började med att sätta grunden till projektet genom att skapa påhittade klasser som ansvarar för att hämta och skicka JSON data. Genom att sedan skapa WeatherService klassen så kunde jag utföra diverse tester.

### Vad som varit svårt
* Det svåraste var att inte riktigt veta till fullo exakt vad som krävdes av oss. Det positiva med det var att jag fick veta att det var inte lika krångligt som jag trodde från början. Efter tydligare instruktioner och efter att jag hade läst igenom allt så var det lättare att planera uppgiften.

### Beskriv lite olika lösningar du gjort
* Några av lösningarna var att säkerställa att nullvärde returnerar ett felmeddelande. Samma gäller även om värdet av sökningen är tom.

### Beskriv något som var besvärligt att få till
* Att inte kunna mocka flera olika anrop i @BeforeEach var lite klurigt för mig. Jag eftersträvar att hitta en bättre lösning än den nedan nästa gång.
### Beskriv om du fått byta lösning och varför i sådana fall

* Jag fick göra en fuling och mocka specifika tester i separata metoder för att exempelvis säkerställa att jag kunde få tillbaka ett negativ resultat, alltså minusgrader i staden Yaktusk

## Slutsatser
* Fantastiskt lärorikt att få skrapa lite på mockandets ljuva värld. Jag tycker att tester är intressanta och jag ser fram emot nästa uppgift.

### Vad gick bra
* Att få en klarare syn i mockandet och förstå grundkonceptet gick bra. Det gick även bra att skapa programmet efter att ha läst den uppdaterade uppgiften.

### Vad gick dåligt
* Att mocka flera anrop i samma @BeforeEach gjorde att det blev en hel del trassel för mig.

### Vad har du lärt dig
* Att man kan, via mockande, kunna simulera anrop till externa tjänster och på så sätt kunna få mig en bild vilka fel som kan uppstå och hur jag gör för att motverka dessa.

### Vad hade ni gjort annorlunda om ni gjort om projektet
* Jättesvårt att säga med tanke på att det är såpass nytt för mig. Jag strävar efter att få nästa mockande bättre än den förra!

### Vilka möjligheter ser du med de kunskaper du fått under kursen.
* Att kunna skriva bättre program som fångar fel och hanterar dessa innan det är för sent. Att tänka "baklänges" som Marcus har sagt är något som har gett mig en bättre förståelse och "aha-upplevelse" än vad jag tidigare haft.
