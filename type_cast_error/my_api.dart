import 'package:pigeon/pigeon.dart';

@ConfigurePigeon(
  PigeonOptions(
    dartOut: 'lib/my_api.g.dart',
    dartOptions: DartOptions(),
    kotlinOut:
        'android/app/src/main/kotlin/dev/yanshouwang/type_cast_error/MyApi.g.kt',
    kotlinOptions: KotlinOptions(
      package: 'dev.yanshouwang.type_cast_error',
    ),
  ),
)
@HostApi()
abstract class MyHostApi {
  void testTypeCastError(MyTestArgs testArgs);
}

class MyTestArgs {
  Map<int?, Uint8List?> itemsArgs;

  MyTestArgs(this.itemsArgs);
}
