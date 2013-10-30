class Volume

  def self.calculate_volume(input_array=[2, 5, 1, 3, 1, 2, 1, 7, 7, 6])
    max = 0
    vol = 0
    input_array.each_with_index do |current_height, index|
      (max = current_height) and next if current_height > max
      vol += (max - current_height) if no_max_present_further?(input_array.drop(index))
    end
    vol
  end

  def self.no_max_present_further?(remaining_array)
    remaining_array.any? { |i| i > remaining_array.first }
  end

end

p Volume.calculate_volume