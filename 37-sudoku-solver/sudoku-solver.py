class Solution:
    def solveSudoku(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        rows = [set() for _ in range(9)]
        cols = [set() for _ in range(9)]
        boxes = [set() for _ in range(9)]  # box index = (r//3)*3 + c//3
        empties = []
        
        # Initialize constraints and collect empty cells
        for r in range(9):
            for c in range(9):
                v = board[r][c]
                if v == '.':
                    empties.append((r, c))
                else:
                    rows[r].add(v)
                    cols[c].add(v)
                    boxes[(r // 3) * 3 + c // 3].add(v)
        
        def backtrack(idx=0) -> bool:
            if idx == len(empties):
                return True
            
            r, c = empties[idx]
            b = (r // 3) * 3 + c // 3
            used = rows[r] | cols[c] | boxes[b]
            
            for d in '123456789':
                if d not in used:
                    board[r][c] = d
                    rows[r].add(d)
                    cols[c].add(d)
                    boxes[b].add(d)
                    
                    if backtrack(idx + 1):
                        return True
                    
                    board[r][c] = '.'
                    rows[r].remove(d)
                    cols[c].remove(d)
                    boxes[b].remove(d)
            return False
        
        backtrack(0)