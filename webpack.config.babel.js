import path from "path";
import config from "./package.json";

export default  {
  entry: {
    main: "./src/main/js/main.js"
  },
  output: {
    path: path.resolve(__dirname,
      `src/main/resources/META-INF/resources/${config.name}`),
    filename: "[name].js"
  },
  module: {
    preLoaders: [
      {
        test: /\.(js|jsx)$/,
        loader: "eslint-loader",
        exclude: /node_modules/
      }
    ],
    loaders: [
      {
        test: /\.(js|jsx)/i,
        loader: "babel",
        exclude: /node_modules/,
        query: {
          cacheDirectory: true
        }
      }
    ]
  },
  plugins: []
};

