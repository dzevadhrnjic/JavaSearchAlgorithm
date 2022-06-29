package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = null;
        List<String> searchRepository = new ArrayList<>();

        while (true) {

            userInput = scanner.nextLine();
            searchRepository.add(userInput);
            List<List<String>> result = search(searchRepository, userInput);
            System.out.println(result);
        }
    }

    public static List<List<String>> search(List<String> searchRepository, String userInput){

        if (userInput == null || userInput.length() < 2){
            return null;
        }

        List<String> keywordsToSearch = splitKeyword(userInput.toLowerCase(Locale.ROOT));

        List<List<String>> result = new ArrayList<>();

        for (String keyword: keywordsToSearch){
            List<String> keywordSearchResult = searchRepository.stream()
                    .map(x->x.toLowerCase(Locale.ROOT))
                    .filter(x->x.startsWith(keyword))
                    .sorted()
                    .limit(3)
                    .collect(Collectors.toList());
            result.add(keywordSearchResult);
        }

        return result;
    }

    public static List<String> splitKeyword(String userInput){

        List<String> keywords = new ArrayList<>();
        for (int index = 2; index <= userInput.length(); index++){
            String value = userInput.substring(0, index);
            keywords.add(value);
        }
        return keywords;
    }
}
