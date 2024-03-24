package LCD;

public class LCD {
    //isi bagian ini
    private String status;
    private int volume;
    private int brightness;
    private String cable;
    
    //buat method yang ada pada soal
    public LCD(){ // konstruktor default
        status = "Off";
        volume = 0;
        brightness = 50;
        cable = "Jenis kabel";
    }

    public void turnOff(){
        this.status = "Off";
    }

    public void turnOn(){
        this.status = "On";
    }

    public void Freeze(){
        this.status = "Freeze";
    }

    public void volumeUp(){
        if (volume < 100){
            volume++; // menaikkan volume sebesar 1
        }
    }

    public void volumeDown(){
        if (volume > 0){
            volume--; // menurunkan volume sebesar 1
        }
    }

    public void brightnessUp(){
        if (volume < 100){
            brightness++; // menaikkan kecerahan sebesar 1
        }
    }

    public void brightnessDown(){
        if (volume > 0){
            brightness--; // menurunkan kecerahan sebesar 1
        }
    }

    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume; // mengatur volume jika berada di dalam jangkauan 0-100
        }
    }

    public void setBrightness(int brightness){
        if (volume >= 0 && volume <= 100){
            this.brightness = brightness; // mengatur kecerahan jika berada di dalam jangkauan 0-100
        }
    }

    public void setCable(int option) {
        //lengkapi method ini dengan mennggunakan array
        String[] cables = {"VGA", "DVI", "HDMI", "DisplayPort"};
        if (option >= 0 && option < cables.length){
            this.cable = cables[option]; // mengatur jenis kabel berdasarkan indeks pilihan yang valid dalam array kabel
        }
    }
    
    public void displayMessage() {
        //lengkapi method ini
        System.out.println("LCD Satus: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + cable);
    }
}