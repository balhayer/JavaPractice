# Creating a back-end basic game
This is a document that shows how to set up the back-end of a simple game. Creating this consist of making a JFrame and using a single thread.

## Creating the Main Method
Everything starts in the `main()` method and we will be initializing the Window class which we will be creating.
```
class Game extends Canvas implements Runnable{
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    static final String TITLE = "GAME TITLE";

    public static void main(String[] args){
        new Window(WIDTH, HEIGHT, TITLE, new Game());
    } 
}
```
First we create three variables: a integer width, a integer height, and a String title. We then instantiate a __Window__ object by putting those variable as arguments.
## Creating the Window Class
The Window class is just creating the frame of the game and getting it up and showing. 
```
class Window extends Canvas{
       private static final long serialVersionUID = 9034494958129720942L;

    public Window(int width, int height, String title, Game game){
        game.setPreferredSize(new Dimension(width, height));
        game.setMaximumSize((new Dimension(width,height)));
        game.setMinimumSize(new Dimension(width,height));

        JFrame frame = new JFrame(title);
        frame.add(game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        game.start();
    }
}
```
The Window class will only have a constructor that will initiate the frame of the game.
It sets the size and making a frame functional.

At the last line, it initiate the method `start()` in the Game class

## Start and Stop Methods
```
private boolean running = false;
private Thread thread;

public synchronized void start(){
    if(running) return;
    running = true;
    thread = new Thread(this);
    thread.start();
}
public synchronized void stop(){
    try{
        thread.join();
        running = false;
    }catch(Exception e){
        e.printStackTrace();
    }
}
```
We create two variables: a boolean, and a thread.
The boolean,"running", is a way to check if the program is running/initialized. The thread variable executes the smallest sequences of programmed instruction.

The `start()` method checks if the thread has been initialized. Once the thread has been initialize it just returns nothing since we don't want to initialize it multiple times.

The `stop()` methods basically stops the thread from running.

When initialize the thread, `thread.start()`, it starts running the method `run()` in the Game class.

## Run Method AKA the Game Loop
```
   public void run() {
        System.out.println("Thread has begun.");
        init();
        this.requestFocus();

        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;
        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1){
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.println("FPS: " + frames + " TICKS: " + updates);
                frames = 0;
                updates = 0;
            }
        }

        stop();
    }
```
The Game Loop is the heartbeat of the game running. It calculates how many frame per seconds and how many ticks are happening within 60 seconds. Each tick runs the method `init()`, `tick()` and `render()`. The init method is where you define all the objects that you will be creating for the game from here on. The tick method processes any input within a tick and it updates the game. The render method updates the graphical image on the program.

## End of Basic Back-End Gaming
At this point, Most of the programming is front-end. Put codes in `init()` to initialize any class objects you want to create. Put codes in `tick()` to update and process any changes and use `render()` to update any graphical changes. Do you remember that init, tick, and render will run itself around 60 times per seconds since it is constantly running in the thread.