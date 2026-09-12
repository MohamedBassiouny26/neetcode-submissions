class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        count=0
        visited=[[]]
        rows,cols=len(grid),len(grid[0])
        def dfs(i,j):
            if i>=rows or i<0 or j>=cols or j<0 or grid[i][j]=='0' :
                return 
            grid[i][j]='0'
            dfs(i-1,j)
            dfs(i+1,j)
            dfs(i,j+1)
            dfs(i,j-1)
    
        for i in range(0,len(grid)):
            for j in range(0,len(grid[i])):
                if grid[i][j] == '1':
                    dfs(i,j)
                    count+=1
        return count