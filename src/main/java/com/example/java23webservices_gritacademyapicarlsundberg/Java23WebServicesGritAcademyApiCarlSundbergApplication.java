package com.example.java23webservices_gritacademyapicarlsundberg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java23WebServicesGritAcademyApiCarlSundbergApplication {



    public static void main(String[] args) {
        SpringApplication.run(Java23WebServicesGritAcademyApiCarlSundbergApplication.class, args);
    }


    /*
Det här verkar vara en omfattande uppgift där du behöver skapa en API-tjänst för GritAcademy med hjälp av Spring Boot och lagra data i en MySQL-databas. Nedan följer en steg-för-steg-guide för att hjälpa dig komma igång:

### Steg 1: Skapa databasen och tabellerna

1. Skapa en MySQL-databas med namnet GritAcademy. Done
2. Skapa följande tabeller med kolumner:
   - students (id, fName, lName, town)
   - courses (id, name, description)
   - students_courses (id, students_id, courses_id) -Done

### Steg 2: Fyll databasen med data

1. Lägg till minst 10 elever i students-tabellen. -Done
2. Lägg till minst 5 kurser i courses-tabellen. -Done
3. Skapa minst 8 associationer mellan elever och kurser i students_courses-tabellen. -half done

### Steg 3: Skapa Spring Boot-projektet

1. Besök https://start.spring.io/ och skapa ett nytt projekt med följande inställningar:
   - Project: Maven Project
   - Language: Java
   - Spring Boot: 2.5.0
   - Project Metadata: Namn och grupp
   - Dependencies: Spring Web, Spring Data JPA, MySQL Driver - done

2. Ladda ner projektet och extrahera det. -done

### Steg 4: Implementera API endpoints

1. Implementera controller-klasser för att hantera API-anrop för att hämta data om studenter, kurser och deras associationer.
2. Implementera funktioner för att lägga till och ta bort kurser, elever och associationer enligt VG-kraven.

### Steg 5: Konfigurera databasanslutning

1. Konfigurera databasanslutningen i `application.properties`-filen för att ansluta till din MySQL-databas.

### Steg 6: Skriv dokumentation

1. Skapa en kort dokumentation (max 1 sida) som beskriver alla API-endpoints och tillgängliga data.

### Steg 7: Testa API:t

1. Starta din Spring Boot-applikation och testa API:ets funktioner med hjälp av verktyg som Postman eller cURL.

### VG-kraven (vid högre betyg)

För VG-kraven, implementera funktioner för att lägga till och ta bort kurser, elever och associationer. Se till att dokumentationen uppdateras enligt de nya endpoint-funktionerna.

Det här är en övergripande guide för att komma igång med din uppgift. Se till att du förstår varje steg och implementerar dem enligt kraven och VG-kraven. Lycka till!

För att implementera GritAcademy API enligt de krav och endpoints som specificerats kan vi strukturera det på följande sätt:

1. **Endpoint för alla studenter** -done
   - **URL:** `/students`
   - **Metod:** GET
   - **Beskrivning:** Hämtar alla studenter.

2. **Endpoint för alla kurser** -done
   - **URL:** `/courses`
   - **Metod:** GET
   - **Beskrivning:** Hämtar alla kurser.

3. **Endpoint för alla associationer mellan studenter och kurser** -done
   - **URL:** `/studentcourses`
   - **Metod:** GET
   - **Beskrivning:** Hämtar alla associationer mellan studenter och kurser.

4. **Endpoint för en student med en specifik id och dess kurser**
   - **URL:** `/students/{studentId}`
   - **Metod:** GET
   - **Beskrivning:** Hämtar en specifik student med angiven ID och deras tillhörande kurser.

5. **Endpoint för alla studenter med ett specifikt förnamn och deras kurser**
   - **URL:** `/students?firstName={firstName}`
   - **Metod:** GET
   - **Beskrivning:** Hämtar alla studenter med ett specifikt förnamn och deras tillhörande kurser.

6. **Endpoint för alla studenter med ett specifikt efternamn och deras kurser**
   - **URL:** `/students?lastName={lastName}`
   - **Metod:** GET
   - **Beskrivning:** Hämtar alla studenter med ett specifikt efternamn och deras tillhörande kurser.

7. **Endpoint för alla studenter från en specifik stad och deras kurser**
   - **URL:** `/students?town={town}`
   - **Metod:** GET
   - **Beskrivning:** Hämtar alla studenter från en specifik stad och deras tillhörande kurser.

8. **Endpoint för en kurs med en specifik id och dess studenter**
   - **URL:** `/courses/{courseId}`
   - **Metod:** GET
   - **Beskrivning:** Hämtar en specifik kurs med angiven ID och dess tillhörande studenter.

9. **Endpoint för en kurs med ett specifikt namn och dess studenter**
   - **URL:** `/courses?name={courseName}`
   - **Metod:** GET
   - **Beskrivning:** Hämtar en specifik kurs med ett specifikt namn och dess tillhörande studenter.

10. **Endpoint för en kurs med ett specifikt ord i namnet**
   - **URL:** `/courses?keyword={keyword}`
   - **Metod:** GET
   - **Beskrivning:** Hämtar en kurs där namnet innehåller det specifika ordet.

11. **Endpoint för en kurs med ett specifikt ord i beskrivningen**
   - **URL:** `/courses?descriptionKeyword={keyword}`
   - **Metod:** GET
   - **Beskrivning:** Hämtar en kurs där beskrivningen innehåller det specifika ordet.

Dokumentationen bör också inkludera en kort beskrivning av varje endpoint, dess URL-struktur och dess användning. Det är också bra att inkludera exempel på response för varje endpoint.
     */

}
