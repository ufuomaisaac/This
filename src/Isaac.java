public class Isaac {
     String skills;

    public Isaac(String skills) {
        this.skills = skills;
    }

    public Isaac() {

    }
    public Isaac plus( Isaac a) {
        Isaac obj = new Isaac();
        obj.skills = this.skills +" + " + a.skills;
        return obj;
    }
}
