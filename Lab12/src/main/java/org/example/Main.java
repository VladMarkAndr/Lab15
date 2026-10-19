package org.example;

import java.util.HashMap;
import java.util.Map;

class Music {
    protected String title;
    protected String id;
    protected int duration;

    public Music(String title, String id, int duration) {
        this.title = title;
        this.id = id;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Music {title='" + title + "', id='" + id + "', duration=" + duration + "}";
    }
}

class Rock extends Music {
    private boolean guitarSolo;

    public Rock(String title, String id, int duration, boolean guitarSolo) {
        super(title, id, duration);
        this.guitarSolo = guitarSolo;
    }

    public boolean isGuitarSolo() {
        return guitarSolo;
    }

    @Override
    public String toString() {
        return "Rock {title='" + title + "', id='" + id + "', duration=" + duration +
                ", guitarSolo=" + guitarSolo + "}";
    }
}

class Classical extends Music {
    private String orchestra;

    public Classical(String title, String id, int duration, String orchestra) {
        super(title, id, duration);
        this.orchestra = orchestra;
    }

    public String getOrchestra() {
        return orchestra;
    }

    @Override
    public String toString() {
        return "Classical {title='" + title + "', id='" + id + "', duration=" + duration +
                ", orchestra='" + orchestra + "'}";
    }
}

class Jazz extends Music {
    private boolean improvisation;

    public Jazz(String title, String id, int duration, boolean improvisation) {
        super(title, id, duration);
        this.improvisation = improvisation;
    }

    public boolean isImprovisation() {
        return improvisation;
    }

    @Override
    public String toString() {
        return "Jazz {title='" + title + "', id='" + id + "', duration=" + duration +
                ", improvisation=" + improvisation + "}";
    }
}

public class Main {
    public static void main(String[] args) {

        Map<String, Music> musicMap = new HashMap<>();

        musicMap.put("Stairway to Heaven", new Rock("Stairway to Heaven", "R01", 482, true));
        musicMap.put("Smells Like Teen Spirit", new Rock("Smells Like Teen Spirit", "R02", 301, true));
        musicMap.put("Back In Black", new Rock("Back In Black", "R03", 255, true));

        musicMap.put("Symphony No. 5", new Classical("Symphony No. 5", "C01", 450, "Berlin Philharmonic"));
        musicMap.put("The Four Seasons", new Classical("The Four Seasons", "C02", 600, "London Symphony Orchestra"));
        musicMap.put("Moonlight Sonata", new Classical("Moonlight Sonata", "C03", 360, "Vienna Philharmonic"));

        musicMap.put("Take Five", new Jazz("Take Five", "J01", 324, true));
        musicMap.put("So What", new Jazz("So What", "J02", 562, true));

        System.out.println("=== Коллекция музыкальных композиций (Map) ===");
        for (Map.Entry<String, Music> entry : musicMap.entrySet()) {
            System.out.println("Ключ: \"" + entry.getKey() + "\"");
            System.out.println("Значение: " + entry.getValue());
            System.out.println("--------------------------------------------------");
        }
    }
}