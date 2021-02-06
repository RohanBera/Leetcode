class Solution:
    def simplifyPath(self, path: str) -> str:
        cannonicalPath = []

        for file in path.split('/'):
            if (file != '' and file != '.' and file != '..'):
                cannonicalPath.append(file)
            elif (file == '..'):
                if (cannonicalPath != []):
                    cannonicalPath.pop()

        # if cannonicalPath == []:
        #     return '/'

        # cannonicalString = '/'
        # cannonicalString += '/'.join(cannonicalPath)

        # for file in cannonicalPath :
            # cannonicalString = cannonicalString + '/' + file

        return '/' + '/'.join(cannonicalPath)
