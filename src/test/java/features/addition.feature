Feature: Testing MusicPlayer
  @MobileTest
  Scenario: Allow storage permission
    Given Check that a permission Window is display
    When Click on Allow button
    Then Check that home page is displayed

  @MobileTest
  Scenario: Verify that song start properly
    Given Go to music player
    Then Check all list is displayed
    When click on 1st song
    Then Check song start
    And Check a small bar chart is displayed
    When Click again on the song name
    Then Check the song page is display

