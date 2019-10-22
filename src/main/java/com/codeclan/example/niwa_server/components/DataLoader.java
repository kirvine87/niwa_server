package com.codeclan.example.niwa_server.components;

import com.codeclan.example.niwa_server.models.Day;
import com.codeclan.example.niwa_server.models.Mood;
import com.codeclan.example.niwa_server.repositories.days.DayRepository;
import com.codeclan.example.niwa_server.repositories.moods.MoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DayRepository dayRepository;

    @Autowired
    MoodRepository moodRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args){
        Date date1 = new Date(1571303730000L);
        Date date2 = new Date(1571390130000L);
        Date date3 = new Date(1571476530000L);
        Date date4 = new Date(1571562930000L);
        Date date5 = new Date(1571649330000L);
        Date date6 = new Date(1571735730000L);
        Date date7 = new Date(1571822130000L);

        // Day 1 Entries
        Day day1 = new Day(date1);
        day1.setJournalEntry("Maecenas posuere velit sed dapibus placerat. Mauris varius, augue nec rutrum egestas, augue ex aliquam orci, eget volutpat odio risus ut ligula. Aliquam eu viverra nisi, sed euismod tortor. Integer non condimentum sem. Maecenas id lacinia est. Ut sollicitudin nibh feugiat sapien imperdiet, quis posuere eros lobortis. Aenean pellentesque venenatis enim, eu faucibus elit viverra et.");
        day1.setCalorieIntake(2700);
        day1.setExercised(false);
        day1.setMeditated(true);
        day1.setWaterIntake(5);
        day1.setWin1("I made it into Codeclan on time!");
        day1.setWin2("I made it to the gym after work even though I was tired.");
        day1.setWin3("My code compiled with no errors, first time!");
        dayRepository.save(day1);

        Mood mood = new Mood(date1, 4, day1);
        mood.setTag("Yay!");
        moodRepository.save(mood);

        Mood mood2 = new Mood(date1, 3, day1);
        mood2.setTag("code probs");
        moodRepository.save(mood2);


        // Day 2 Entries
        Day day2 = new Day(date2);
        day2.setJournalEntry("Aliquam hendrerit dui non faucibus accumsan. Proin commodo arcu tortor, congue sagittis ante maximus quis. Cras viverra, mauris id tincidunt aliquet, velit lectus cursus lorem, vel ultrices elit orci vel nisl. Maecenas id scelerisque risus. Sed quis leo nec diam egestas finibus ac vitae ex. Aenean nec urna vitae elit commodo gravida ut quis ante. Nam porta at enim vel finibus. Duis iaculis eros hendrerit, euismod est mattis, congue lacus. Nulla facilisi. Aliquam erat volutpat. Donec finibus sit amet lorem eget auctor.");
        day2.setCalorieIntake(1984);
        day2.setExercised(true);
        day2.setMeditated(true);
        day2.setWaterIntake(5);
        day2.setWin1("I got out of bed even though it was cold and I wasn't feeling good.");
        day2.setWin2("I made it to the gym after work even though I was tired.");
        day2.setWin3("My code compiled with no errors, first time!");
        dayRepository.save(day2);

        Mood mood3 = new Mood(date2, 4, day2);
        mood3.setTag("code working!");
        moodRepository.save(mood3);

        // Day 3 Entries
        Day day3 = new Day(date3);
        day3.setJournalEntry("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempus dapibus velit. Nullam quis pharetra sem. Donec euismod urna non libero dignissim, ut faucibus orci tempor. Cras facilisis nibh non mi vulputate, id imperdiet sapien blandit. Phasellus volutpat ex lectus, quis varius arcu bibendum a. Donec eu ex non nulla tempor pulvinar non nec urna. Donec viverra odio vel varius pretium. Curabitur euismod arcu a turpis elementum, et faucibus ligula congue. Duis venenatis porta est varius pretium.");
        day3.setCalorieIntake(1996);
        day3.setExercised(true);
        day3.setMeditated(true);
        day3.setWaterIntake(7);
        day3.setWin1("I did some really good work on my Codeclan project.");
        day3.setWin2("I took some time to play games and hang out with friends.");
        day3.setWin3("I found a really weird bug in my code and fixed it.");
        dayRepository.save(day3);

        Mood mood4 = new Mood(date3, 4, day3);
        mood4.setTag("gym!");
        moodRepository.save(mood4);

        //Day 4 Entries
        Day day4 = new Day(date4);
        day4.setJournalEntry("Morbi non elit tincidunt, porta purus sit amet, scelerisque tellus. Morbi blandit commodo pretium. Proin efficitur justo nec lobortis venenatis. Vivamus nunc dolor, consequat sed auctor bibendum, maximus at lectus. Phasellus eleifend dui posuere, pharetra odio in, aliquam orci. Sed sed velit quis purus facilisis condimentum ut aliquet mi. Donec egestas metus eu sem imperdiet convallis. Duis at metus convallis, accumsan massa sed, egestas est. Sed imperdiet est eu purus mattis viverra. Duis at dictum eros. Nulla porta ullamcorper urna, id hendrerit libero lacinia nec.");
        day4.setCalorieIntake(2354);
        day4.setExercised(true);
        day4.setMeditated(false);
        day4.setWaterIntake(5);
        day4.setWin1("I didn't shout at people even though I really wanted to.");
        day4.setWin2("I took some time to play games and hang out with friends.");
        day4.setWin3("I found a really weird bug in my code and fixed it.");
        dayRepository.save(day4);

        Mood mood5 = new Mood(date4, 4, day4);
        moodRepository.save(mood5);

        //Day 5 Entries
        Day day5 = new Day(date5);
        day5.setJournalEntry("Maecenas pharetra feugiat diam, ac dignissim nibh viverra eu. Aenean sed fermentum libero. In congue accumsan dolor, lobortis sodales elit luctus ut. Nulla quis justo eget justo accumsan sagittis. Ut tincidunt orci orci, vel vestibulum risus fermentum nec. Aliquam erat volutpat. Quisque at lacus a sapien ornare dapibus ut et tellus. Curabitur dignissim ullamcorper fringilla. Nunc sed feugiat ante. Aliquam ornare justo nisl, eu bibendum nulla pretium et. Sed erat leo, tempus non pellentesque ut, tempus non odio.");
        day5.setCalorieIntake(1988);
        day5.setExercised(true);
        day5.setMeditated(true);
        day5.setWaterIntake(5);
        day5.setWin1("Finished another feature for our project!");
        day5.setWin2("Made it to the gym again.");
        day5.setWin3("I found a really weird bug in my code and fixed it.");
        dayRepository.save(day5);

        Mood mood6 = new Mood(date5, 3, day5);
        Mood mood7 = new Mood(date5, 5, day5);
        moodRepository.save(mood6);
        moodRepository.save(mood7);

        // Day 6 Entries
        Day day6 = new Day(date6);
        day6.setJournalEntry("Cras sit amet dictum odio, eget semper magna. Quisque auctor augue in elit rhoncus, vulputate ultricies enim sodales. Fusce id nunc fringilla nunc semper tempor et quis justo. Proin at cursus erat. Sed placerat at enim in facilisis. In vitae pharetra sem. In pulvinar, diam sed tincidunt bibendum, ex orci accumsan ligula, at eleifend purus mauris eu massa. Duis sollicitudin in lectus a pretium. Mauris nibh lorem, ultricies at lorem et, rhoncus pellentesque enim. Nulla efficitur lacus mauris, sit amet vestibulum metus fermentum et. Aliquam a diam ut neque tempor aliquet. Praesent rutrum libero ac eros eleifend laoreet sit amet et massa. Proin ut urna at lectus fringilla semper nec eu libero.");
        day6.setCalorieIntake(2712);
        day6.setExercised(true);
        day6.setMeditated(true);
        day6.setWaterIntake(8);
        day6.setWin1("Was late to the gym but still worked out!");
        day6.setWin2("Had a nice dinner with my partner, and we cooked together.");
        day6.setWin3("Booked a holiday for next month. Woohoo!");
        dayRepository.save(day6);

        Mood mood8 = new Mood(date6, 4, day6);
        mood8.setTag("cooking");
        Mood mood9 = new Mood(date6, 3, day6);
        mood9.setTag("couldn't sleep");
        moodRepository.save(mood8);
        moodRepository.save(mood9);

        // Day 7 Entries
        Day day7 = new Day(date7);
        day7.setJournalEntry("Quisque hendrerit sed orci sit amet iaculis. Mauris ut maximus tortor, nec lobortis nisl. Sed ut purus ac lacus placerat iaculis ac eleifend mi. Mauris vel arcu ac metus ornare viverra at quis nulla. Cras efficitur, nulla ut imperdiet elementum, enim mi ornare velit, quis ornare metus augue in tellus. Pellentesque semper vel nisi ut hendrerit. Maecenas blandit eu lorem ut consectetur. Cras porta efficitur felis eu convallis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Proin et imperdiet enim, eu interdum justo. Sed vitae ligula dolor. Nullam malesuada purus neque, eu sollicitudin sem blandit vitae.");
        day7.setCalorieIntake(3024);
        day7.setExercised(false);
        day7.setMeditated(true);
        day7.setWaterIntake(4);
        day7.setWin1("Handed in our final project. So proud!");
        day7.setWin2("Didn't go to the gym, but spent some time relaxing which was well deserved.");
        day7.setWin3("Finished our presentation!");
        dayRepository.save(day7);

        Mood mood10 = new Mood(date7, 2, day7);
        mood10.setTag("getting ready to do a presentation");
        Mood mood11 = new Mood(date7, 5, day7);
        mood10.setTag("finished our project!");
        moodRepository.save(mood10);
        moodRepository.save(mood11);
    }
}
