package com.ai.miliprep.ghostwriter

import com.theokanning.openai.OpenAiService
import com.theokanning.openai.completion.CompletionChoice
import com.theokanning.openai.completion.CompletionRequest
import com.theokanning.openai.engine.Engine

class Ghostwriter {
    private val token: String = System.getenv("OPEN_AI_TOKEN")
    val service: OpenAiService = OpenAiService(token)

    val davinci: Engine = service.getEngine("davinci") //text-davinci-002
    val storyArray = ArrayList<CompletionChoice>()

    fun go(){
        println("Putting a story together...")

        val completionRequest = CompletionRequest.builder()
            .prompt("I launched and recovered Military Aircraft on the flight deck of a naval ship")
            .temperature(0.7)
            .maxTokens(50)
            .topP(1.0)
            .frequencyPenalty(0.0)
            .presencePenalty(0.3)
            .echo(true)
            .build()
        service.createCompletion("davinci", completionRequest).choices
            .forEach{line -> storyArray.add(line)}
        println(storyArray)
    }
}