package swing.balls;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Figure Drawing Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);

            Me me = new Me();
            frame.add(me);
            frame.setVisible(true);
            frame.setFocusable(true);
            frame.requestFocus();

            Thread ballThread = new Thread(() -> {
                Ball ball = new Ball();
                frame.add(ball);
                frame.setVisible(true);

                ball.setXSpeed(2); // Set the initial speed in the x-direction
                ball.setYSpeed(2); // Set the initial speed in the y-direction

                while (true) {
                    ball.move();
                    ball.repaint();

                    if (ball.getRightX() > frame.getWidth() / 2 || ball.getLeftX() < 0) {
                        // Reverse the x-direction speed to make the ball bounce off horizontal walls
                        ball.setXSpeed(-ball.getXSpeed());
                    }

                    if (ball.getRightY() > frame.getHeight() / 2 || ball.getLeftY() < 0) {
                        // Reverse the y-direction speed to make the ball bounce off vertical walls
                        ball.setYSpeed(-ball.getYSpeed());

                    }
                    try {
                        //if (ball.getBorder()> frame.getWidth())
                        Thread.sleep(100); // Delay in milliseconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            ballThread.start();


            frame.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    int keyCode = e.getKeyCode();

                    // Adjust the speed as needed
                    int speed = 10;

                    if (keyCode == KeyEvent.VK_LEFT) {
                        me.setXSpeed(-speed); // Move left
                    } else if (keyCode == KeyEvent.VK_RIGHT) {
                        me.setXSpeed(speed); // Move right
                    } else if (keyCode == KeyEvent.VK_UP) {
                        me.setYSpeed(-speed); // Move up
                    } else if (keyCode == KeyEvent.VK_DOWN) {
                        me.setYSpeed(speed); // Move down
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    int keyCode = e.getKeyCode();

                    if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_RIGHT) {
                        me.setXSpeed(0); // Stop horizontal movement
                    } else if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN) {
                        me.setYSpeed(0); // Stop vertical movement
                    }
                }
            });

            Thread thread = new Thread(() -> {
                while (true) {
                    me.move();
                    me.repaint();
                    try {
                        Thread.sleep(100); // Delay in milliseconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        });
    }
}
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Figure Drawing Example");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(300, 300);
//
//            frame.setVisible(true);
//            frame.setFocusable(true);
//            frame.requestFocus();
//
//
//
//
//            Thread thread2 = new Thread(() -> {
//
//                me.move();
//                frame.add(me);
//
//                while (true) {
//                    me.move();
//                    me.repaint();
//                    try {
//                        Thread.sleep(10); // Delay in milliseconds
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//
//            });
//            thread2.start();
//            frame.addKeyListener(new KeyListener() {
//                @Override
//                public void keyTyped(KeyEvent e) {
//                    // We don't need this method for this example
//                }
//
//                @Override
//                public void keyPressed(KeyEvent e) {
//                    int keyCode = e.getKeyCode();
//
//                    // Adjust the speed as needed
//                    int speed = 5;
//
//                    if (keyCode == KeyEvent.VK_LEFT) {
//                        me.setXSpeed(-speed); // Move left
//                    } else if (keyCode == KeyEvent.VK_RIGHT) {
//                        me.setXSpeed(speed); // Move right
//                    } else if (keyCode == KeyEvent.VK_UP) {
//                        me.setYSpeed(-speed); // Move up
//                    } else if (keyCode == KeyEvent.VK_DOWN) {
//                        me.setYSpeed(speed); // Move down
//                    }
//                }
//
//                @Override
//                public void keyReleased(KeyEvent e) {
//                    int keyCode = e.getKeyCode();
//
//                    if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_RIGHT) {
//                        me.setXSpeed(0); // Stop horizontal movement
//                    } else if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN) {
//                        me.setYSpeed(0); // Stop vertical movement
//                    }
//                }
//            });
//            Thread thread = new Thread(() -> {
//                Ball ball = new Ball();
//                frame.add(ball);
//                frame.setVisible(true);
//
//                ball.setXSpeed(2); // Set the initial speed in the x-direction
//                ball.setYSpeed(2); // Set the initial speed in the y-direction
//
//                while (true) {
//                    ball.move();
//                    ball.repaint();
//
//                    if (ball.getRightX() > frame.getWidth() / 2 || ball.getLeftX() < 0) {
//                        // Reverse the x-direction speed to make the ball bounce off horizontal walls
//                        ball.setXSpeed(-ball.getXSpeed());
//                    }
//
//                    if (ball.getRightY() > frame.getHeight() / 2 || ball.getLeftY() < 0) {
//                        // Reverse the y-direction speed to make the ball bounce off vertical walls
//                        ball.setYSpeed(-ball.getYSpeed());
//
//                    }
//                    try {
//                        //if (ball.getBorder()> frame.getWidth())
//                        Thread.sleep(100); // Delay in milliseconds
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//            thread.start();
//
//
//            Thread thread3 = new Thread(() -> {
//                Ball ball = new Ball();
//                frame.add(ball);
//                frame.setVisible(true);
//
//                ball.setXSpeed(1); // Set the initial speed in the x-direction
//                ball.setYSpeed(1); // Set the initial speed in the y-direction
//                while (true) {
//                    ball.move();
//                    ball.repaint();
//
//                    if (ball.getRightX() > frame.getWidth() / 2 || ball.getLeftX() < 0) {
//                        // Reverse the x-direction speed to make the ball bounce off horizontal walls
//                        ball.setXSpeed(-ball.getXSpeed());
//                    }
//
//                    if (ball.getRightY() > frame.getHeight() / 2 || ball.getLeftY() < 0) {
//                        // Reverse the y-direction speed to make the ball bounce off vertical walls
//                        ball.setYSpeed(-ball.getYSpeed());
//
//                    }
//                    try {
//                        //if (ball.getBorder()> frame.getWidth())
//                        Thread.sleep(100); // Delay in milliseconds
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//            thread3.start();
//
//        });
//    }
//}
