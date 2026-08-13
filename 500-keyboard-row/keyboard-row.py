from typing import List

class Solution:
    def findWords(self, words: List[str]) -> List[str]:

        mapping = {}

        for ch in "qwertyuiop":
            mapping[ch] = "1"

        for ch in "asdfghjkl":
            mapping[ch] = "2"

        for ch in "zxcvbnm":
            mapping[ch] = "3"

        result = []

        for word in words:
            x = True
            row = mapping[word[0].lower()]

            for ch in word:
                if mapping[ch.lower()] != row:
                    x = False
                    break

            if x:
                result.append(word)

        return result