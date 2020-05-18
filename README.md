# WorkoutCounter
Automating counting workout reps using the front camera. [Experimenting]

## main pipeline:
### save pattern
- Detect motion
- Binarize changed pixels
- Segment image
- Calculate average of each segment (I call this array step)
- Low-pass-filter changes between frames segment
- Keep unique steps [create profile for motion] (key steps)
### count psttern in frames
Having new activity, try to map each frame to key steps:
- Step is decided based on least distance to key steps
- One rep is marked by going from first to last back to first key step



