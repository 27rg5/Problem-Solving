class Solution:
    def removeStones(self, stones):
        def dfs(i, j):
            # Remove the current stone from the set of points
            points.discard((i, j))
            
            # Check all stones in the same row
            for y in rows[i]:
                if (i, y) in points:
                    dfs(i, y)
            
            # Check all stones in the same column
            for x in cols[j]:
                if (x, j) in points:
                    dfs(x, j)

        # Initialize data structures
        points = {(i, j) for i, j in stones}  # Set of all stone coordinates
        island = 0  # Counter for connected components
        rows = collections.defaultdict(list)  # Dictionary to store stones in each row
        cols = collections.defaultdict(list)  # Dictionary to store stones in each column

        # Populate rows and cols dictionaries
        for i, j in stones:
            rows[i].append(j)
            cols[j].append(i)

        # Perform DFS for each stone
        for i, j in stones:
            if (i, j) in points:
                dfs(i, j)
                island += 1

        # Return the number of stones that can be removed
        return len(stones) - island