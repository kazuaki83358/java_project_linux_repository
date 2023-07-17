package rest_api_pack;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Rest_Api_Main {
    public static void main(String[] args) throws Exception {
        Transcript transcript = new Transcript();
        transcript.setAudio_url("https://raw.githubusercontent.com/kazuaki83358/audio/main/audio.mp3");
        transcript.setSpeaker_labels(true);
        transcript.setSpeakers_expected(1);
        transcript.setLanguage_code("en_us");
        transcript.setPunctuate(true);
        transcript.setFormat_text(true);
        // Set other desired parameters...

        Gson gson = new Gson();
        String JsonRequest = gson.toJson(transcript);
        System.out.println(JsonRequest);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization", "2cc83f7a9f134e2e853a3f674b77a916")
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(JsonRequest))
                .build();

        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(postResponse.body());
        transcript = gson.fromJson(postResponse.body(),Transcript.class);
        System.out.println(transcript.getId());

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
                .header("Authorization", "2cc83f7a9f134e2e853a3f674b77a916")
                .build();
        while (true){
            HttpResponse<String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
            transcript = gson.fromJson(getResponse.body(),Transcript.class);
            System.out.println(transcript.getStatus());
            if ("completed".equals(transcript.getStatus())||"error".equals(transcript.getStatus())){
                break;
            }
            Thread.sleep(1000);
        }
        System.out.println("Transcription Completed");
        System.out.println(transcript.getText());

    }
}
