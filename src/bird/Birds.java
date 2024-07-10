package bird;

public class Birds {

    protected String name;

      public Birds (){

      }

      public Birds(String name){
          this.name = name;
      }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                '}';
    }

    public void fly() {

    }
}
