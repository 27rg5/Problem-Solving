class Solution:
    def watchedVideosByFriends(self, watchedVideos: List[List[str]], friends: List[List[int]], id: int, level: int) -> List[str]:
        # Initialize BFS set and visited set with the starting user id
        bfs = {id}
        visited = {id}

        # Perform BFS for the specified number of levels
        for _ in range(level):
            # Get friends of current level users who haven't been visited
            new_friends = set()
            for user in bfs:
                for friend in friends[user]:
                    if friend not in visited:
                        new_friends.add(friend)

            # Update BFS set and visited set
            bfs = new_friends
            visited.update(new_friends)

        # Count frequency of watched videos by friends at the target level
        video_freq = collections.Counter()
        for user in bfs:
            video_freq.update(watchedVideos[user])

        # Sort and return recommended videos based on frequency and alphabetical order
        return sorted(video_freq.keys(), key=lambda x: (video_freq[x], x))