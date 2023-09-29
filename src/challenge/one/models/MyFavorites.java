package challenge.one.models;

public class MyFavorites {
    public void include(Audio audio){
        if (audio.getClassification() > 4){
            System.out.printf("%s is one my favorites to listen.%n",
                    audio.getTitle());
        } else {
            System.out.printf("%s it's okay.%n",audio.getTitle());
        }
    }
}
