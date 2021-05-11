import repository

# 1. INSERT
data = {"title": "제목1", "content": "내용1"}
# repository.save(data)

# 2. SELECT
# repository.findAll()

repository.findById(13)

# 3. DELETE
repository.deleteById(13)
