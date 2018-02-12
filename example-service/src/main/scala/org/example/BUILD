scala_library(
    name='server',
    dependencies=[
        '3rdparty/jvm/com/twitter/finagle:finagle',
    ],
    sources=rglobs('*scala')
)

jvm_binary(
    name='bin',
    dependencies=[':server'],
    main='org.example.Main',
)
