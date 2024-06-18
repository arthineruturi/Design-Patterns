
# Bridge Design Pattern 

The Bridge design pattern separates how things are done (abstraction) from what gets done (implementation), allowing them to change independently.

## Example 

In our example, we use the Bridge pattern to create remote controls that work with different devices like TVs and radios.

- **Abstraction**:
  - `RemoteControl`: Defines how to control devices with methods like `turnOn()`, `turnOff()`, and `setVolume(int volume)`.

- **Implementation**:
  - `Device`: Represents the actual devices with methods such as `turnOn()`, `turnOff()`, and `setVolume(int volume)`.
  - `TV` and `Radio`: Concrete implementations of devices with specific functionality.

