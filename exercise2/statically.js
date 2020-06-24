class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
    static #glue = "Epoxy";
    jello = "Jello";

    static moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    static stubborn() {
        Statically.moveAndShake();
        console.log("Please don't make me change... I just don't like it...");
    }

    static explain() {
        Statically.stubborn();
        console.log(Statically.#glue);
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
        // Made all the methods static so they could call one another. Called all methods on the Statically class since they can;t be called on instances of the class. No real difference between static in JS and static in Java.
    }

    getGlue() {
        return Statically.#glue;
    }

}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

Statically.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log(stats.getGlue());
console.log(stats.jello);