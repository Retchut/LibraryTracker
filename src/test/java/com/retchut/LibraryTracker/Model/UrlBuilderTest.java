package com.retchut.LibraryTracker.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlBuilderTest {

    @Test
    void urlSimpleOneWord1(){
        String name = "Tatsunoko";
        String expansion = "HISU";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Hidden-Summoners/Tatsunoko";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlSimpleOneWord2(){
        String name = "Zefraath";
        String expansion = "MACR";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Maximum-Crisis/Zefraath";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlSimpleTwoWords(){
        String name = "Zefra Providence";
        String expansion = "MACR";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Maximum-Crisis/Zefra-Providence";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlSimpleMultipleWords(){
        String name = "Oracle of Zefra";
        String expansion = "PEVO";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Pendulum-Evolution/Oracle-of-Zefra";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlWithCommas(){
        String name = "Zefraniu, Secret of the Yang Zing";
        String expansion = "CROS";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Crossed-Souls/Zefraniu-Secret-of-the-Yang-Zing";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }


    @Test
    void urlWithSlash(){
        String name = "D/D/D Supersight King Zero Maxwell";
        String expansion = "LIOV";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Lightning-Overdrive/DDD-Supersight-King-Zero-Maxwell";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }


    @Test
    void urlWithEquals(){
        String name = "Damage = Reptile";
        String expansion = "ANGU";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Ancient-Guardians/Damage-Reptile";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlWithDoublePoints(){
        String name = "Number 39: Utopia";
        String expansion = "DUPO";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Duel-Power/Number-39-Utopia";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }


    @Test
    void urlWithAmpersand(){
        String name = "Ghost Reaper & Winter Cherries";
        String expansion = "DUPO";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Duel-Power/Ghost-Reaper-Winter-Cherries";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlWithAt(){
        String name = "Bururu @Ignister";
        String expansion = "IGAS";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Ignition-Assault/Bururu-Ignister";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlLotsOfSymbols(){
        String name = "Danger!? Tsuchinoko?";
        String expansion = "MP19";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/2019-Gold-Sarcophagus-Tin-Mega-Pack/Danger-Tsuchinoko";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlDash() {
        String name = "Blue-Eyes White Dragon";
        String expansion = "MAGO";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Maximum-Gold/Blue-Eyes-White-Dragon";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlDashWithSpace() {
        String name = "Abyss Actor - Superstar";
        String expansion = "DESO";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Destiny-Soldiers/Abyss-Actor-Superstar";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlWithParentheses1(){
        String name = "Knightmare Unicorn (V.1 - Rare)";
        String expansion = "GEIM";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Genesis-Impact/Knightmare-Unicorn-V1-Rare";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlWithParentheses2(){
        String name = "The Winged Dragon of Ra (V.2 - Ghost Rare)";
        String expansion = "LED7";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Legendary-Duelists-Rage-of-Ra/The-Winged-Dragon-of-Ra-V2-Ghost-Rare";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlQuotationMarks1() {
        String name = "\"A\" Cell Breeding Device";
        String expansion = "FOTB";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Force-of-the-Breaker/A-Cell-Breeding-Device";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void urlQuotationMarks2() {
        String name = "\"A\" Cell Incubator";
        String expansion = "GLAS";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Gladiators-Assault/A-Cell-Incubator";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }


    @Test
    void alternateRarities1(){
        String name = "Effect Veiler (V.2 - Ultimate Rare)";
        String expansion = "DREV";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Duelist-Revolution/Effect-Veiler-V-2";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void alternateRarities2(){
        String name = "Blue-Eyes White Dragon (V.2 - Ultimate Rare)\n";
        String expansion = "YSKR";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Starter-Deck-Kaiba-Reloaded/Blue-Eyes-White-Dragon-V-2";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void alternateRarities3(){
        String name = "Celestia, Lightsworn Angel (V.2 - Ultimate Rare)";
        String expansion = "LODT";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Light-of-Destruction/Celestia-Lightsworn-Angel-V-2-Ultimate-Rare";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }

    @Test
    void alternateRarities4(){
        String name = "Lightning Storm (V.2 - Starlight Rare)";
        String expansion = "IGAS";
        String expected = "https://www.cardmarket.com/en/YuGiOh/Products/Singles/Ignition-Assault/Lightning-Storm-V-2-Prismatic-Secret-Rare";

        UrlBuilder urlBuilder = new UrlBuilder();
        String returned = urlBuilder.buildUrl(name, expansion);
        Assertions.assertEquals(expected, returned);
    }
}