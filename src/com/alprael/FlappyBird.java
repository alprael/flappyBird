package com.alprael;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener {

  public static FlappyBird flappyBird;
  public final int HEIGHT = 800, WIDTH = 800;

  public Renderer renderer;

  public FlappyBird() {
    JFrame jframe = new JFrame();
    Timer timer = new Timer(20, this);
    renderer = new Renderer();
    jframe.add(renderer);
    jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    jframe.setSize(WIDTH, HEIGHT);
    jframe.setVisible(true);
    timer.start();

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    renderer.repaint();

  }

  public void repaint(Graphics g) {

  }

    public static void main(String[] args) {

  }


}
