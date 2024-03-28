class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        min_len=min(len(s) for s in strs)
        prefix=""
        for i in range(min_len):
            if all(s[i]==strs[0][i] for s in strs):
                prefix+=strs[0][i]
            else:
                break
        return prefix