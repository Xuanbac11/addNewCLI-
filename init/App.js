import React, { useEffect } from 'react';
import { Button } from 'react-native';
import { View } from 'react-native';

import {
  Text, NativeModules,
} from 'react-native';

function App() {
  const { CalendarModule } = NativeModules
  const onSum = async () => {
    let a = await CalendarModule.onSum(1, 2)
    console.log(a);
  }

  return (
    <View>
      <Button title='onSum' onPress={onSum} />
    </View>
  )
}


export default App;
